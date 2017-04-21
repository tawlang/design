package com.company.tl.command;

/**
 * Created by taolang on 2017/4/21.
 */
public class AddRequirementCommand extends Command{

    @Override
    public void execute() {
        super.rg.find();
        super.rg.add();
    }
}
