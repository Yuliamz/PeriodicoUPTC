'use strict';

module.controller('ArticuloCtrl', ['$scope', '$filter', '$http', function($scope, $filter, $http) {
    //listar
    $scope.lista = [];
    $scope.listaPalabraClave = [];
    $scope.datosFormulario = {};
    $scope.panelEditar = false;

    $scope.visto = function() {
        //            $scope.datosFormulario.texto = $('#texto').froalaEditor('html.get');
        //            console.log($scope.datosFormulario.texto);
        //            $scope.toBase64();
        console.log(JSON.stringify($scope.tags));
    };

    $("#imagen").on('change', function() {
        var selectedFile = this.files[0];
        if (selectedFile) {
            $scope.toBase64(selectedFile);
        }
    });

    $scope.toBase64 = function(file) {
        var reader = new FileReader();
        reader.readAsDataURL(file);
        reader.onload = function() {
            $scope.datosFormulario.imagen = reader.result;
            console.log($scope.datosFormulario.imagen);
            $('#displayImage').attr('src', $scope.datosFormulario.imagen);
        };
        reader.onerror = function(error) {
            console.log('Error: ', error);
        };
    };

    $scope.listar = function() {
        $http.get('./webresources/Articulo', {})
            .success(function(data, status, headers, config) {
                $scope.lista = data;
            }).error(function(data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
    };

    $scope.listarPalabraClave = function() {
        $http.get('./webresources/Tag', {})
            .success(function(data, status, headers, config) {
                $scope.listaPalabraClave = data;
            }).error(function(data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de palabraClave, por favor intente m\xe1s tarde');
            });
    };
    $scope.listarPalabraClave();

    $scope.listarSeccion = function() {
        $http.get('./webresources/Seccion', {})
            .success(function(data, status, headers, config) {
                $scope.listaSeccion = data;
            }).error(function(data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de seccion, por favor intente m\xe1s tarde');
            });
    };
    $scope.listarSeccion();


    $scope.listar();
    //guardar
    $scope.nuevo = function() {
        $scope.panelEditar = true;
        $scope.datosFormulario = {};
        $('#texto').froalaEditor('html.set', "<p> Contenido del Artículo </p>");
        $('#displayImage').removeAttr("src");
        $('.fstChoiceItem').remove();
    };

    $scope.guardar = function() {
        $scope.errores = {};
        var error = false;

        if (error)
            return;
        $scope.datosFormulario.texto = $('#texto').froalaEditor('html.get');
        $scope.datosFormulario.tags = $scope.tags.join(", ");
        $http.post('./webresources/Articulo', JSON.stringify($scope.datosFormulario), {}).success(function(data, status, headers, config) {
            alert("Los datos han sido guardados con Exito");
            console.log(JSON.stringify($scope.datosFormulario));
            $scope.panelEditar = false;
            $scope.listar();
        }).error(function(data, status, headers, config) {
            alert('Error al guardar la informaci\xf3n, por favor intente m\xe1s tarde');
        });
    };
    $scope.cancelar = function() {
        $scope.panelEditar = false;
        $scope.datosFormulario = {};
        $scope.tags = [];
    };

    //editar
    $scope.editar = function(data) {
        $scope.panelEditar = true;
        $scope.datosFormulario = data;
        $('#texto').froalaEditor('html.set', $scope.datosFormulario.texto);
        $('#displayImage').attr('src', $scope.datosFormulario.imagen);
        $('#imagen').value = "";
        $('.fstChoiceItem').remove();
        var tagString = $scope.datosFormulario.tags.replace(/\s/g,'');
        $scope.tags = tagString.split(",");
        for (var i = 0; i < $scope.tags.length; i++) {
            $(".fstControls").prepend('<div data-text="'+$scope.tags[i]+'" data-value="'+$scope.tags[i]+'" class="fstChoiceItem">'+$scope.tags[i]+'<button class="fstChoiceRemove" type="button">×</button></div>');
        }
            console.log($scope.tags);
       
    };
    //eliminar
    $scope.eliminar = function(data) {
        if (confirm('\xbfDesea elminar este registro?')) {
            $http.delete('./webresources/Articulo/' + data.id, {})
                .success(function(data, status, headers, config) {
                    $scope.listar();
                }).error(function(data, status, headers, config) {
                    alert('Error al eliminar la informaci\xf3n de Articulo, por favor intente m\xe1s tarde');
                });
        }
    };
}]);