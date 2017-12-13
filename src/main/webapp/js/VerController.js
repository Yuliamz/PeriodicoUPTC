'use strict';

module.controller('VerCtrl', ['$scope', '$filter', '$http', '$rootScope', function($scope, $filter, $http, $rootScope) {
    $scope.mostrar =function(){
        var option = $rootScope.articulo;
            console.log(JSON.stringify($rootScope.articulo));
      $('#tituloArticulo').text(option.titulo);
      $('#imagenArticulo').attr('src', option.imagen);
      $('#contenidoArticulo').append(option.texto);
      $('#palabrasClaveArticulo').text(option.tags);
    };
    $scope.mostrar();
    
}]);