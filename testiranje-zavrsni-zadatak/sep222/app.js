var app = angular.module('myApp', []);
app.controller('MyCtrl', function ($scope) {
    var vm = this;
    vm.obj = {
        isbn: '',
        naslov: "",
        autor: "",
        cena: 0
    }

    vm.add = function () {
        var el = {
            isbn: vm.obj.isbn,
            naslov: vm.obj.naslov,
            autor: vm.obj.autor,
            cena: vm.obj.cena
        }
        vm.knjige.push(el);
        }

    vm.brisi = function (el) {
        var lista = [];
        for (let i = 0; i < vm.knjige.length; i++) {
            //if (vm.vina[i] != el) {
            if(i != vm.knjige.length-1){
                lista.push(vm.knjige[i]);
            }
        }
        vm.knjige = lista;
    }

    vm.knjige = [
        { isbn: 'J-117', naslov: "First and Only", autor: "Dan Abnett", cena:17},
        { isbn: 'K-9', naslov: "Eisenhorn: Xenos", autor: "Dan Abnett", cena: 25},
        { isbn: 'P-90', naslov: "Death or Glory", autor: "Sandy Mitchell", cena: 30},
        { isbn: 'MGS5:PP', naslov: "Shadow of the Torturer", autor: "Gene Wolfe", cena: 23},
    ]

    vm.izracunajProsek = function(){
        vm.suma = 0;
        for(var i in vm.knjige){
            suma += vm.knjige[i].cena;
        }
        vm.prosek = suma / vm.knjige.length;
    }
});
