const getPeliculas   = async() =>{
    const respuesta  = await fetch(`http://localhost:8080/cinestarapi/peliculas`)
    console.log(respuesta)

    if (respuesta.status === 200){
        const peliculas = await respuesta.json()
        let html = `<br/><h1>Cartelera</h1><br/>`
        peliculas.forEach(pelicula => {
            html += `
            <div class="contenido-pelicula">
                <div class="datos-pelicula">
                    <h2>${pelicula.titulo}</h2><br/>
                    <p>${pelicula.sinopsis}</p>
                    <br/>
                       <div class="boton-pelicula"> 
                           <a href="http://www.cinestar.com.pe/cartelera/pelicula/${pelicula.titulo}" >
                               <img src="img/varios/btn-mas-info.jpg" width="120" height="30" alt="Ver info"/>
                           </a>
                       </div>
                       <div class="boton-pelicula"> 
                           <a href="http://www.cinestar.com.pe/popups/trailer/v3fspveODBI" onclick="return hs.htmlExpand(this, { objectType: 'iframe' } )" >
                               <img src="img/varios/btn-trailer.jpg" width="120" height="30" alt="Ver trailer"/>
                           </a>
                    </div> 
                </div>
                <img src="img/pelicula/${pelicula.id}.jpg" width="160" height="226"/><br/><br/>
            </div>
            `
        });

        document.getElementById('contenido-interno').innerHTML=html
    }

}

getPeliculas();