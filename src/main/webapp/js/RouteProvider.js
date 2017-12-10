'use strict';


// Declare app level module which depends on filters, and services
var app=angular.module('adminPeriodico', [
  'ngRoute',
  'angularUtils.directives.dirPagination',
  'adminPeriodico.controllers'
]);
app.config(['$routeProvider', function($routeProvider) {
	$routeProvider.when('/', {templateUrl: 'partials/menu.html'});
	$routeProvider.when('/Seccion', {templateUrl: 'partials/Seccion.html', controller: 'SeccionCtrl'});
	$routeProvider.when('/Articulo', {templateUrl: 'partials/Articulo.html', controller: 'ArticuloCtrl'});
	$routeProvider.when('/Tag', {templateUrl: 'partials/Tag.html', controller: 'TagCtrl'});
	$routeProvider.when('/Administrador', {templateUrl: 'partials/Administrador.html', controller: 'AdministradorCtrl'});
	
  	$routeProvider.otherwise({redirectTo: '/'}); 
}]);

var module=angular.module("adminPeriodico.controllers",[]);
