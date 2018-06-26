/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package it.sauronsoftware.jave;

import java.io.File;

/***
 *
 * @since:jave 1.0
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a> 
 * 2018/06/26 13:45
 */
public class AudioUtils {

    /***
     * MP3转换
     * @param sourcePath
     * @param targetPath
     */
    public static void getAmrConversionMp3(String sourcePath, String targetPath) {
        File source = new File(sourcePath);
        File target = new File(targetPath);
        AudioAttributes audio = new AudioAttributes();
        AmrToMp3Encoder encoder = new AmrToMp3Encoder();
        audio.setCodec("libmp3lame");
        EncodingAttributes attrs = new EncodingAttributes();
        attrs.setFormat("mp3");
        attrs.setAudioAttributes(audio);
        try {
            encoder.encode(source, target, attrs);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InputFormatException e) {
            e.printStackTrace();
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }
}
