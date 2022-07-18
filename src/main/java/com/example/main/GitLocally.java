package com.example.main;

// TODO: HEAD始终在当前工作的分支上
public class GitLocally {

    // > Git init 创建一个.git/仓库，其中包含所有的metadata
    // > echo "hell, git" > README.txt

    // > git add
    // > git commit -m "..."
    // > git commit -am "..." 合并add和commit两个操作

    // > git log                查看提交的commit日志
    // > git diff --cached      比较暂存区Staging Area和Repository仓库的区别
    // > git diff dd68....      查看两版本提交之间的的区别
    // > git diff HEAD~1..HEAD  HEAD是最新提交的版本，diff查看的区别的是从前一版到HEAD的区别
    // > git diff HEAD~1..      和上一个指令效果一致
    // > git diff HEAD~1        和上一个指令效果一致

    // > git diff-tree -C -r ac... xns5... 比较两版提交之间的所有区别(适用于提交量过大的场景)
    //    -C	detect copies.
    //    -r	diff recursively

    // > git add -u 添加所有的updates files to my staging area 暂存区(其中的改变将会在下一次的提交中添加)
    // > git add -A 添加所以的文件，包括没有追踪的文件

    // > git checkout file.txt   撤回之前的修改
    // > git reset --hard        撤回到前一个HEAD，撤销所有的修改
    // > git reset --soft HEAD~1 软撤回到指定的修改
    // > git reset --hard HEAD~1 撤回到上一次的commit提交的状态

    // > git revert 912aaf....   撤销历史记录中的commit
    // > git push                重新提交revert的更改到remote repository

    // > git clean -n
    // > git clean -f  移除掉新添加的，没有追踪的文件
}
