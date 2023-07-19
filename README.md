# MiApp
Aplicación para aprender a usar Spring

carpeta "delivery" es donde estan los Controladores

carpeta "domain" es donde estan los Servicios 

carpeta "infrastructure" carpeta de Repositorio, termina siendo una clase que
tiene diferentes metodos y cada uno de llo ejecuta una query sobre una base de datos.(consulta encapsulada en un metodo)

el ciclo es: Controller pide logica de negocio aun Servicio y el servicio consulta al Repocitorio la persistencia o recuperacion
de datos a la Base de Datos. El repositorio devuelve al Servico y de ahi al controller que al final lo muestra en la View.
