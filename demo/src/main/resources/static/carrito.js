async function getCarrito() {
    let url = 'http://localhost:8080/api/v1//carrito/{id}/';
    try {
        let res = await fetch(url);
        return await res.json();
    } catch (error) {
        console.log(error);
    }
}

async function renderCarrito() {
   	let [products] = await Promise.all([getCarrito()]);
    let html = '';

    products.map(product => {
        let htmlSegment = `<div class="row main align-items-center">
                            <div class="col-2"><img class="img-fluid" src="${product.imageproduct}"></div>
                            <div class="col">
                                <div class="row text-muted">${product.idproduct}</div>
                            </div>
                            <div class="col"> 
                                <a href="#">-</a><a href="#" class="border">1</a><a href="#">+</a> </div>
                                <div class="col">&euro; ${product.price} <span class="close">&#10005;</span></div>
                            </div>`;
        html += htmlSegment;
    });
    
    let container = document.querySelector('.container');
    container.innerHTML = html;
}