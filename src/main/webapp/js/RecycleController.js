'use strict';

/**
 * RecycleController
 * @constructor
 */
var RecycleController = function($scope, $http) {
	$scope.isSave=true;
	$scope.isShow = false;
	$scope.isMenuShow = false;
	$scope.deleteFile;
	$scope.recoverFile;
    $scope.fetchFilesList = function() {
        $http.get('cloudDisk/trash.do').success(function(FileList){
            $scope.Files = FileList;
        });
    };

    $scope.showDelete = function(file){
    	var obj = $("#final_delete_confirm");
    	obj.show();
    	$scope.deleteFile = file;
    };
    $scope.showRecover = function(file){
    	var obj = $("#restore_conform");
    	obj.show();
    	$scope.recoverFile = file;
    };
    $scope.hideDelete = function(file){
    	var obj = $("#final_delete_confirm");
    	obj.hide();
    };
    $scope.hideRecover = function(file){
    	var obj = $("#restore_conform");
    	obj.hide();
    };
    $scope.finalDelete = function() {
    	$("#final_delete_confirm").hide();
    	console.log($scope.deleteFile.id);
        $http.post('cloudDisk/finaldelete.do', $scope.deleteFile).success(function() {
            $scope.fetchFilesList();
        });
    };
    $scope.recover = function() {
    	$("#restore_conform").hide();
        $http.post('cloudDisk/recover.do', $scope.recoverFile).success(function() {
            $scope.fetchFilesList();
        });
    };
    $scope.fetchFilesList();
};
