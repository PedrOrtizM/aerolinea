package com.aerolinea.api.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aerolinea.api.business.UsuarioBusiness;
import com.aerolinea.api.domain.Response;
import com.aerolinea.api.domain.UserDTO;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@RestController
@RequestMapping("/api/v1.0")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@SwaggerDefinition(tags = { @Tag(name = "general", description = "RestController") })
public class AerolineaRest {

	private UsuarioBusiness userBusiness;

	public AerolineaRest(UsuarioBusiness userBusiness) {
		super();
		this.userBusiness = userBusiness;
	}

	@ApiOperation(value = "Permite crear un usuario", notes = "Crea un nuevo usuario en la base de datos"
			+ " sobre la tabla usuario, con base en el JSON recibido", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiParam(name = "usuario", value = "JSON con la informacion del usuario", required = true, type = "userDTO")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "El usuario fue creado exitosamente", response = Response.class),
			@ApiResponse(code = 400, message = "Error en la creacion del usuario, debido a un error en los datos de la peticion recibida", response = Response.class),
			@ApiResponse(code = 500, message = "Error en la creacion del usuario, generado por un error en el servidor", response = Response.class) })
	@PostMapping(value = "/product", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<Void> createUser(@RequestBody UserDTO userDTO) {
		return userBusiness.createUser(userDTO);
	}

}
