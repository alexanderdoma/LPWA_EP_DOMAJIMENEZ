const getCines   = async() =>{
    const respuesta  = await fetch(`http://localhost:8080/cinestarapi/cines`)
    console.log(respuesta)

    if (respuesta.status === 200){
        const cines = await respuesta.json()
        let html = `<br/><h1>Nuestros Cines</h1><br/>`
        cines.forEach(cine => {
            html += `
                <div class="contenido-cine">
                <img src="img/cine/${cine.id}.1.jpg" width="227" height="170"/>
                <div class="datos-cine">
                        <h4>${cine.razonSocial}</h4><br/>
                    <span>${cine.direccion} - ${cine.detalle}<br/><br/>Teléfono: ${cine.telefonos}</span>
                </div>
                <br/>
                <a href="cine.html?id=${cine.id}">
                    <img src="img/varios/ico-info2.png" width="150" height="40"/>
                </a>
                </div>
            `
        });

        document.getElementById('contenido-interno').innerHTML=html
    }

}

getCines();