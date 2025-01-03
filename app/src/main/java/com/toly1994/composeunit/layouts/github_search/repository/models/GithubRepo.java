package com.toly1994.composeunit.layouts.github_search.repository.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GithubRepo {

    /**
     * id : 138010
     * node_id : MDEwOlJlcG9zaXRvcnkxMzgwMTA=
     * name : bort
     * full_name : abcd/bort
     * private : false
     * owner : {"login":"abcd","id":58120,"node_id":"MDQ6VXNlcjU4MTIw","avatar_url":"https://avatars.githubusercontent.com/u/58120?v=4","gravatar_id":"","url":"https://api.github.com/users/abcd","html_url":"https://github.com/abcd","followers_url":"https://api.github.com/users/abcd/followers","following_url":"https://api.github.com/users/abcd/following{/other_user}","gists_url":"https://api.github.com/users/abcd/gists{/gist_id}","starred_url":"https://api.github.com/users/abcd/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/abcd/subscriptions","organizations_url":"https://api.github.com/users/abcd/orgs","repos_url":"https://api.github.com/users/abcd/repos","events_url":"https://api.github.com/users/abcd/events{/privacy}","received_events_url":"https://api.github.com/users/abcd/received_events","type":"User","site_admin":false}
     * html_url : https://github.com/abcd/bort
     * description : A base rails app featuring: RESTful Authentication, Will Paginate, Rspec &amp; Rspec-rails, Exception Notifier, Asset Packager, Cap Recipe (multi-stage). Put together by Fudge to remove the need for boring project setup.
     * fork : true
     * url : https://api.github.com/repos/abcd/bort
     * forks_url : https://api.github.com/repos/abcd/bort/forks
     * keys_url : https://api.github.com/repos/abcd/bort/keys{/key_id}
     * collaborators_url : https://api.github.com/repos/abcd/bort/collaborators{/collaborator}
     * teams_url : https://api.github.com/repos/abcd/bort/teams
     * hooks_url : https://api.github.com/repos/abcd/bort/hooks
     * issue_events_url : https://api.github.com/repos/abcd/bort/issues/events{/number}
     * events_url : https://api.github.com/repos/abcd/bort/events
     * assignees_url : https://api.github.com/repos/abcd/bort/assignees{/user}
     * branches_url : https://api.github.com/repos/abcd/bort/branches{/branch}
     * tags_url : https://api.github.com/repos/abcd/bort/tags
     * blobs_url : https://api.github.com/repos/abcd/bort/git/blobs{/sha}
     * git_tags_url : https://api.github.com/repos/abcd/bort/git/tags{/sha}
     * git_refs_url : https://api.github.com/repos/abcd/bort/git/refs{/sha}
     * trees_url : https://api.github.com/repos/abcd/bort/git/trees{/sha}
     * statuses_url : https://api.github.com/repos/abcd/bort/statuses/{sha}
     * languages_url : https://api.github.com/repos/abcd/bort/languages
     * stargazers_url : https://api.github.com/repos/abcd/bort/stargazers
     * contributors_url : https://api.github.com/repos/abcd/bort/contributors
     * subscribers_url : https://api.github.com/repos/abcd/bort/subscribers
     * subscription_url : https://api.github.com/repos/abcd/bort/subscription
     * commits_url : https://api.github.com/repos/abcd/bort/commits{/sha}
     * git_commits_url : https://api.github.com/repos/abcd/bort/git/commits{/sha}
     * comments_url : https://api.github.com/repos/abcd/bort/comments{/number}
     * issue_comment_url : https://api.github.com/repos/abcd/bort/issues/comments{/number}
     * contents_url : https://api.github.com/repos/abcd/bort/contents/{+path}
     * compare_url : https://api.github.com/repos/abcd/bort/compare/{base}...{head}
     * merges_url : https://api.github.com/repos/abcd/bort/merges
     * archive_url : https://api.github.com/repos/abcd/bort/{archive_format}{/ref}
     * downloads_url : https://api.github.com/repos/abcd/bort/downloads
     * issues_url : https://api.github.com/repos/abcd/bort/issues{/number}
     * pulls_url : https://api.github.com/repos/abcd/bort/pulls{/number}
     * milestones_url : https://api.github.com/repos/abcd/bort/milestones{/number}
     * notifications_url : https://api.github.com/repos/abcd/bort/notifications{?since,all,participating}
     * labels_url : https://api.github.com/repos/abcd/bort/labels{/name}
     * releases_url : https://api.github.com/repos/abcd/bort/releases{/id}
     * deployments_url : https://api.github.com/repos/abcd/bort/deployments
     * created_at : 2009-02-26T07:43:14Z
     * updated_at : 2019-08-13T14:04:10Z
     * pushed_at : 2008-11-28T14:36:05Z
     * git_url : git://github.com/abcd/bort.git
     * ssh_url : git@github.com:abcd/bort.git
     * clone_url : https://github.com/abcd/bort.git
     * svn_url : https://github.com/abcd/bort
     * homepage : http://www.fudgestudios.com
     * size : 943
     * stargazers_count : 2
     * watchers_count : 2
     * language : Ruby
     * has_issues : true
     * has_projects : true
     * has_downloads : true
     * has_wiki : true
     * has_pages : false
     * forks_count : 0
     * mirror_url : null
     * archived : false
     * disabled : false
     * open_issues_count : 0
     * license : null
     * allow_forking : true
     * is_template : false
     * web_commit_signoff_required : false
     * topics : []
     * visibility : public
     * forks : 0
     * open_issues : 0
     * watchers : 2
     * default_branch : master
     */

    private int id;
    private String node_id;
    private String name;
    private String full_name;
    @SerializedName("private")
    private boolean privateX;
    private OwnerBean owner;
    private String html_url;
    private String description;
    private boolean fork;
    private String url;
    private String forks_url;
    private String keys_url;
    private String collaborators_url;
    private String teams_url;
    private String hooks_url;
    private String issue_events_url;
    private String events_url;
    private String assignees_url;
    private String branches_url;
    private String tags_url;
    private String blobs_url;
    private String git_tags_url;
    private String git_refs_url;
    private String trees_url;
    private String statuses_url;
    private String languages_url;
    private String stargazers_url;
    private String contributors_url;
    private String subscribers_url;
    private String subscription_url;
    private String commits_url;
    private String git_commits_url;
    private String comments_url;
    private String issue_comment_url;
    private String contents_url;
    private String compare_url;
    private String merges_url;
    private String archive_url;
    private String downloads_url;
    private String issues_url;
    private String pulls_url;
    private String milestones_url;
    private String notifications_url;
    private String labels_url;
    private String releases_url;
    private String deployments_url;
    private String created_at;
    private String updated_at;
    private String pushed_at;
    private String git_url;
    private String ssh_url;
    private String clone_url;
    private String svn_url;
    private String homepage;
    private int size;
    private int stargazers_count;
    private int watchers_count;
    private String language;
    private boolean has_issues;
    private boolean has_projects;
    private boolean has_downloads;
    private boolean has_wiki;
    private boolean has_pages;
    private int forks_count;
    private Object mirror_url;
    private boolean archived;
    private boolean disabled;
    private int open_issues_count;
    private Object license;
    private boolean allow_forking;
    private boolean is_template;
    private boolean web_commit_signoff_required;
    private String visibility;
    private int forks;
    private int open_issues;
    private int watchers;
    private String default_branch;
    private List<?> topics;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public boolean isPrivateX() {
        return privateX;
    }

    public void setPrivateX(boolean privateX) {
        this.privateX = privateX;
    }

    public OwnerBean getOwner() {
        return owner;
    }

    public void setOwner(OwnerBean owner) {
        this.owner = owner;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getDescription() {
        if(description ==null){
            return "暂无简介";
        }
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFork() {
        return fork;
    }

    public void setFork(boolean fork) {
        this.fork = fork;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getForks_url() {
        return forks_url;
    }

    public void setForks_url(String forks_url) {
        this.forks_url = forks_url;
    }

    public String getKeys_url() {
        return keys_url;
    }

    public void setKeys_url(String keys_url) {
        this.keys_url = keys_url;
    }

    public String getCollaborators_url() {
        return collaborators_url;
    }

    public void setCollaborators_url(String collaborators_url) {
        this.collaborators_url = collaborators_url;
    }

    public String getTeams_url() {
        return teams_url;
    }

    public void setTeams_url(String teams_url) {
        this.teams_url = teams_url;
    }

    public String getHooks_url() {
        return hooks_url;
    }

    public void setHooks_url(String hooks_url) {
        this.hooks_url = hooks_url;
    }

    public String getIssue_events_url() {
        return issue_events_url;
    }

    public void setIssue_events_url(String issue_events_url) {
        this.issue_events_url = issue_events_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public String getAssignees_url() {
        return assignees_url;
    }

    public void setAssignees_url(String assignees_url) {
        this.assignees_url = assignees_url;
    }

    public String getBranches_url() {
        return branches_url;
    }

    public void setBranches_url(String branches_url) {
        this.branches_url = branches_url;
    }

    public String getTags_url() {
        return tags_url;
    }

    public void setTags_url(String tags_url) {
        this.tags_url = tags_url;
    }

    public String getBlobs_url() {
        return blobs_url;
    }

    public void setBlobs_url(String blobs_url) {
        this.blobs_url = blobs_url;
    }

    public String getGit_tags_url() {
        return git_tags_url;
    }

    public void setGit_tags_url(String git_tags_url) {
        this.git_tags_url = git_tags_url;
    }

    public String getGit_refs_url() {
        return git_refs_url;
    }

    public void setGit_refs_url(String git_refs_url) {
        this.git_refs_url = git_refs_url;
    }

    public String getTrees_url() {
        return trees_url;
    }

    public void setTrees_url(String trees_url) {
        this.trees_url = trees_url;
    }

    public String getStatuses_url() {
        return statuses_url;
    }

    public void setStatuses_url(String statuses_url) {
        this.statuses_url = statuses_url;
    }

    public String getLanguages_url() {
        return languages_url;
    }

    public void setLanguages_url(String languages_url) {
        this.languages_url = languages_url;
    }

    public String getStargazers_url() {
        return stargazers_url;
    }

    public void setStargazers_url(String stargazers_url) {
        this.stargazers_url = stargazers_url;
    }

    public String getContributors_url() {
        return contributors_url;
    }

    public void setContributors_url(String contributors_url) {
        this.contributors_url = contributors_url;
    }

    public String getSubscribers_url() {
        return subscribers_url;
    }

    public void setSubscribers_url(String subscribers_url) {
        this.subscribers_url = subscribers_url;
    }

    public String getSubscription_url() {
        return subscription_url;
    }

    public void setSubscription_url(String subscription_url) {
        this.subscription_url = subscription_url;
    }

    public String getCommits_url() {
        return commits_url;
    }

    public void setCommits_url(String commits_url) {
        this.commits_url = commits_url;
    }

    public String getGit_commits_url() {
        return git_commits_url;
    }

    public void setGit_commits_url(String git_commits_url) {
        this.git_commits_url = git_commits_url;
    }

    public String getComments_url() {
        return comments_url;
    }

    public void setComments_url(String comments_url) {
        this.comments_url = comments_url;
    }

    public String getIssue_comment_url() {
        return issue_comment_url;
    }

    public void setIssue_comment_url(String issue_comment_url) {
        this.issue_comment_url = issue_comment_url;
    }

    public String getContents_url() {
        return contents_url;
    }

    public void setContents_url(String contents_url) {
        this.contents_url = contents_url;
    }

    public String getCompare_url() {
        return compare_url;
    }

    public void setCompare_url(String compare_url) {
        this.compare_url = compare_url;
    }

    public String getMerges_url() {
        return merges_url;
    }

    public void setMerges_url(String merges_url) {
        this.merges_url = merges_url;
    }

    public String getArchive_url() {
        return archive_url;
    }

    public void setArchive_url(String archive_url) {
        this.archive_url = archive_url;
    }

    public String getDownloads_url() {
        return downloads_url;
    }

    public void setDownloads_url(String downloads_url) {
        this.downloads_url = downloads_url;
    }

    public String getIssues_url() {
        return issues_url;
    }

    public void setIssues_url(String issues_url) {
        this.issues_url = issues_url;
    }

    public String getPulls_url() {
        return pulls_url;
    }

    public void setPulls_url(String pulls_url) {
        this.pulls_url = pulls_url;
    }

    public String getMilestones_url() {
        return milestones_url;
    }

    public void setMilestones_url(String milestones_url) {
        this.milestones_url = milestones_url;
    }

    public String getNotifications_url() {
        return notifications_url;
    }

    public void setNotifications_url(String notifications_url) {
        this.notifications_url = notifications_url;
    }

    public String getLabels_url() {
        return labels_url;
    }

    public void setLabels_url(String labels_url) {
        this.labels_url = labels_url;
    }

    public String getReleases_url() {
        return releases_url;
    }

    public void setReleases_url(String releases_url) {
        this.releases_url = releases_url;
    }

    public String getDeployments_url() {
        return deployments_url;
    }

    public void setDeployments_url(String deployments_url) {
        this.deployments_url = deployments_url;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getPushed_at() {
        return pushed_at;
    }

    public void setPushed_at(String pushed_at) {
        this.pushed_at = pushed_at;
    }

    public String getGit_url() {
        return git_url;
    }

    public void setGit_url(String git_url) {
        this.git_url = git_url;
    }

    public String getSsh_url() {
        return ssh_url;
    }

    public void setSsh_url(String ssh_url) {
        this.ssh_url = ssh_url;
    }

    public String getClone_url() {
        return clone_url;
    }

    public void setClone_url(String clone_url) {
        this.clone_url = clone_url;
    }

    public String getSvn_url() {
        return svn_url;
    }

    public void setSvn_url(String svn_url) {
        this.svn_url = svn_url;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStargazers_count() {
        return stargazers_count;
    }

    public void setStargazers_count(int stargazers_count) {
        this.stargazers_count = stargazers_count;
    }

    public int getWatchers_count() {
        return watchers_count;
    }

    public void setWatchers_count(int watchers_count) {
        this.watchers_count = watchers_count;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isHas_issues() {
        return has_issues;
    }

    public void setHas_issues(boolean has_issues) {
        this.has_issues = has_issues;
    }

    public boolean isHas_projects() {
        return has_projects;
    }

    public void setHas_projects(boolean has_projects) {
        this.has_projects = has_projects;
    }

    public boolean isHas_downloads() {
        return has_downloads;
    }

    public void setHas_downloads(boolean has_downloads) {
        this.has_downloads = has_downloads;
    }

    public boolean isHas_wiki() {
        return has_wiki;
    }

    public void setHas_wiki(boolean has_wiki) {
        this.has_wiki = has_wiki;
    }

    public boolean isHas_pages() {
        return has_pages;
    }

    public void setHas_pages(boolean has_pages) {
        this.has_pages = has_pages;
    }

    public int getForks_count() {
        return forks_count;
    }

    public void setForks_count(int forks_count) {
        this.forks_count = forks_count;
    }

    public Object getMirror_url() {
        return mirror_url;
    }

    public void setMirror_url(Object mirror_url) {
        this.mirror_url = mirror_url;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public int getOpen_issues_count() {
        return open_issues_count;
    }

    public void setOpen_issues_count(int open_issues_count) {
        this.open_issues_count = open_issues_count;
    }

    public Object getLicense() {
        return license;
    }

    public void setLicense(Object license) {
        this.license = license;
    }

    public boolean isAllow_forking() {
        return allow_forking;
    }

    public void setAllow_forking(boolean allow_forking) {
        this.allow_forking = allow_forking;
    }

    public boolean isIs_template() {
        return is_template;
    }

    public void setIs_template(boolean is_template) {
        this.is_template = is_template;
    }

    public boolean isWeb_commit_signoff_required() {
        return web_commit_signoff_required;
    }

    public void setWeb_commit_signoff_required(boolean web_commit_signoff_required) {
        this.web_commit_signoff_required = web_commit_signoff_required;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public int getForks() {
        return forks;
    }

    public void setForks(int forks) {
        this.forks = forks;
    }

    public int getOpen_issues() {
        return open_issues;
    }

    public void setOpen_issues(int open_issues) {
        this.open_issues = open_issues;
    }

    public int getWatchers() {
        return watchers;
    }

    public void setWatchers(int watchers) {
        this.watchers = watchers;
    }

    public String getDefault_branch() {
        return default_branch;
    }

    public void setDefault_branch(String default_branch) {
        this.default_branch = default_branch;
    }

    public List<?> getTopics() {
        return topics;
    }

    public void setTopics(List<?> topics) {
        this.topics = topics;
    }

    public static class OwnerBean {
        /**
         * login : abcd
         * id : 58120
         * node_id : MDQ6VXNlcjU4MTIw
         * avatar_url : https://avatars.githubusercontent.com/u/58120?v=4
         * gravatar_id :
         * url : https://api.github.com/users/abcd
         * html_url : https://github.com/abcd
         * followers_url : https://api.github.com/users/abcd/followers
         * following_url : https://api.github.com/users/abcd/following{/other_user}
         * gists_url : https://api.github.com/users/abcd/gists{/gist_id}
         * starred_url : https://api.github.com/users/abcd/starred{/owner}{/repo}
         * subscriptions_url : https://api.github.com/users/abcd/subscriptions
         * organizations_url : https://api.github.com/users/abcd/orgs
         * repos_url : https://api.github.com/users/abcd/repos
         * events_url : https://api.github.com/users/abcd/events{/privacy}
         * received_events_url : https://api.github.com/users/abcd/received_events
         * type : User
         * site_admin : false
         */

        private String login;
        private int id;
        private String node_id;
        private String avatar_url;
        private String gravatar_id;
        private String url;
        private String html_url;
        private String followers_url;
        private String following_url;
        private String gists_url;
        private String starred_url;
        private String subscriptions_url;
        private String organizations_url;
        private String repos_url;
        private String events_url;
        private String received_events_url;
        private String type;
        private boolean site_admin;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getGravatar_id() {
            return gravatar_id;
        }

        public void setGravatar_id(String gravatar_id) {
            this.gravatar_id = gravatar_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getFollowers_url() {
            return followers_url;
        }

        public void setFollowers_url(String followers_url) {
            this.followers_url = followers_url;
        }

        public String getFollowing_url() {
            return following_url;
        }

        public void setFollowing_url(String following_url) {
            this.following_url = following_url;
        }

        public String getGists_url() {
            return gists_url;
        }

        public void setGists_url(String gists_url) {
            this.gists_url = gists_url;
        }

        public String getStarred_url() {
            return starred_url;
        }

        public void setStarred_url(String starred_url) {
            this.starred_url = starred_url;
        }

        public String getSubscriptions_url() {
            return subscriptions_url;
        }

        public void setSubscriptions_url(String subscriptions_url) {
            this.subscriptions_url = subscriptions_url;
        }

        public String getOrganizations_url() {
            return organizations_url;
        }

        public void setOrganizations_url(String organizations_url) {
            this.organizations_url = organizations_url;
        }

        public String getRepos_url() {
            return repos_url;
        }

        public void setRepos_url(String repos_url) {
            this.repos_url = repos_url;
        }

        public String getEvents_url() {
            return events_url;
        }

        public void setEvents_url(String events_url) {
            this.events_url = events_url;
        }

        public String getReceived_events_url() {
            return received_events_url;
        }

        public void setReceived_events_url(String received_events_url) {
            this.received_events_url = received_events_url;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean isSite_admin() {
            return site_admin;
        }

        public void setSite_admin(boolean site_admin) {
            this.site_admin = site_admin;
        }
    }
}
