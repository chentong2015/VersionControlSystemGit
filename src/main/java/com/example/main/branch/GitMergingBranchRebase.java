package com.example.main.branch;

public class GitMergingBranchRebase {

    // > git log --graph --oneline --all --decorate
    // > git reflog 显示HEAD所在的reference的所有记录，用于找回之前的信息

    // > git branch fix1
    // > git checkout fix1
    // > git branch -m fix1 bug123 重命名分支名称
    // > git branch -d bug123 删除分支
    // > git branch -D bug123 强制删除分支，即使分支没有被merge

    // > git push origin master
    // > git push origin new.branch 添加远端的新分支，并做push
    // > git push origin :delete.branch 删除远端的分支

    // > git stash 暂时保存目前的工作信息和状态
    // > git stash list
    // > git stash apply 从暂存的list中取出暂存的状态，不移除list中的信息
    // > git stash pop   取出并移除list中信息

    // > git merge     > 有可能出现冲突
    // > git mergetool 合并分支，解决Conflict的View工具 > KDiff3
    // > git rebase    合并分支，不保留分支的历史记录 > 有可能出现冲突

    // > git cherry-pick 6fa43245
    //   Select one single commit and apply it 给分支添加指定的补丁
}
