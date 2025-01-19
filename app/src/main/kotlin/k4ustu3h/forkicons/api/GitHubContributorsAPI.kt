package k4ustu3h.forkicons.api

import k4ustu3h.forkicons.model.GitHubContributor
import retrofit2.http.GET

interface GitHubContributorsAPI {

    @GET("repos/k4ustu3h/forkicons/contributors")
    suspend fun getContributors(): List<GitHubContributor>
}
