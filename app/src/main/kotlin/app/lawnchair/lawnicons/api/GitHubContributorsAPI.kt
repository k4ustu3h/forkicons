package app.lawnchair.lawnicons.api

import app.lawnchair.lawnicons.model.GitHubContributor
import retrofit2.http.GET

interface GitHubContributorsAPI {

    @GET("repos/k4ustu3h/forkicons/contributors")
    suspend fun getContributors(): List<GitHubContributor>
}
