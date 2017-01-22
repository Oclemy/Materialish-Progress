package com.tutorials.hp.materialish_progress;

import android.content.Context;
import android.graphics.Color;
import android.os.AsyncTask;
import android.widget.Toast;

import com.pnikosis.materialishprogress.ProgressWheel;

/**
 * Created by Oclemy on 8/2/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class Downloader extends AsyncTask<Void,Void,Void> {

   Context c;
   ProgressWheel pw;


    public Downloader(Context c,ProgressWheel pw) {
        this.c = c;
        this.pw=pw;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

        pw.spin();

    }

    @Override
    protected Void doInBackground(Void... voids) {
        download();
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        pw.setProgress(0);
        Toast.makeText(c, "Finished", Toast.LENGTH_SHORT).show();
    }

    private void download()
    {
        for (int i=0;i<100;i++)
        {
            try
            {
                Thread.sleep(100);

            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

}
