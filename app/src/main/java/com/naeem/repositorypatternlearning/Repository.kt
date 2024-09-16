package com.naeem.repositorypatternlearning

class Repository(
    private val localDataSource: MyLocalDataSource,
    private val remoteDataSource: MyRemoteDataSource
) {

}
