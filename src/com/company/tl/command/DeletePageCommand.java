package com.company.tl.command;

/**
 * Created by taolang on 2017/4/21.
 */
public class DeletePageCommand extends Command {

    @Override
    public void execute() {
        super.rg.find();
        super.pg.delete();
    }
}
