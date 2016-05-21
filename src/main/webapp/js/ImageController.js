'use strict';

/**
 * FileController
 * @constructor
 */
var ImageController = function($scope, $http, $window) {
	$scope.isSave=true;
	$scope.isShow = false;
	$scope.isMenuShow = false;
	$scope.deleteFile;
    $scope.fetchFilesList = function() {
        $http.get('cloudDisk/type.do?type=picture').success(function(FileList){
            $scope.Files = FileList;
        });
    };

    $scope.addNewFolder = function(foldername) {
        $http.post('cloudDisk/addDir.do?foldername=' + foldername).success(function() {
            $scope.fetchFilesList();
            $scope.isShow = !$scope.isShow;
        });
        $scope.foldername = '';
    };
    $scope.showNewFolder = function() {
    	$scope.isShow = !$scope.isShow;
    };
    $scope.showMenu = function() {
    	$scope.isMenuShow = !$scope.isMenuShow;
    };
    $scope.showEdit = function(file) {
    	//$scope.isSave = !$scope.isSave;
    	var id = "txt_name_" + file.id;
    	
//    	console.log(id);
    	var obj = $("#"+id);
    	
        obj.removeClass("inactive");
        obj.addClass("active");
        obj.removeAttr("readOnly");
        var saveid = "save_name_" +file.id;
        var save_button = $("#"+saveid);
//        console.log(save_button);
    	save_button.removeClass("hide");
    	var cancel_id = "cancel_name_"+ file.id;
    	var cancel_button = $("#" + cancel_id);
    	cancel_button.removeClass("hide");
    };
    $scope.showDelete = function(file){
    	var obj = $("#confirm");
    	obj.show();
    	$scope.deleteFile = file;
    }
    $scope.hideDeleteDialog=function(){
    	$("#confirm").hide();
    }
    $scope.editFile = function(file){
    	$http.post('cloudDisk/edit.do',file).success(function() {
            $scope.fetchFilesList();
        });
    }
    $scope.removeFile = function() {
    	$("#confirm").hide();
    	console.log($scope.deleteFile.id);
        $http.post('cloudDisk/delete.do', $scope.deleteFile).success(function() {
            $scope.fetchFilesList();
        });
    };
    $scope.download = function(file){
    	$http.get('download.do?id=', file.id).success(function(data,status){
    		console.log(data);
    		$window.open(data);
    	});
    }


    $scope.fetchFilesList();
};
