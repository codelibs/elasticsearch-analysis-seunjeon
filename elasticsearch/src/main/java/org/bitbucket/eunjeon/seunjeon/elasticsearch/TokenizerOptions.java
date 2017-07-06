package org.bitbucket.eunjeon.seunjeon.elasticsearch;

import java.util.List;

public class TokenizerOptions {
    public final static boolean DECOMPOUND = true;
    public final static boolean DEINFLECT = true;
    public final static boolean INDEX_EOJEOL = true;
    public final static String[] INDEX_POSES = TokenBuilder.INDEX_POSES_JAVA();
    public final static boolean POS_TAGGING = true;
    public final static int MAX_UNK_LENGTH = 8;

    private String userDictPath = null;
    private String[] userWords = new String[0];
    private boolean deCompound = DECOMPOUND;
    private boolean deInflect = DEINFLECT;
    private boolean indexEojeol = INDEX_EOJEOL;
    private String[] indexPoses = INDEX_POSES;
    private String name = null;
    private boolean posTagging = POS_TAGGING;
    private int maxUnkLength = MAX_UNK_LENGTH;

    public static TokenizerOptions create(String name) {
        return new TokenizerOptions(name);
    }

    private TokenizerOptions(String name) {
        this.name = name;
    }


    public TokenizerOptions setPosTagging(boolean posTagging) {
        this.posTagging = posTagging;
        return this;
    }

    public TokenizerOptions setMaxUnkLength(int length) {
        this.maxUnkLength = length;
        return this;
    }

    public TokenizerOptions setUserDictPath(String userDictPath) {
        this.userDictPath = userDictPath;
        return this;
    }

    public TokenizerOptions setUserWords(String[] userWords) {
        this.userWords = userWords;
        return this;
    }

    public TokenizerOptions setDeCompound(boolean deCompound) {
        this.deCompound = deCompound;
        return this;
    }

    public TokenizerOptions setDeInflect(boolean deInflect) {
        this.deInflect = deInflect;
        return this;
    }

    public TokenizerOptions setIndexEojeol(boolean indexEojeol) {
        this.indexEojeol = indexEojeol;
        return this;
    }

    public TokenizerOptions setIndexPoses(String[] indexPoses) {
        this.indexPoses = indexPoses;
        return this;
    }

    public String getUserDictPath() {
        return this.userDictPath;
    }

    public String[] getUserWords() {
        return this.userWords;
    }

    public boolean getDeCompound() {
        return this.deCompound;
    }

    public boolean getDeInflect() {
        return this.deInflect;
    }

    public boolean getIndexEojeol() {
        return this.indexEojeol;
    }

    public String[] getIndexPoses() {
        return this.indexPoses;
    }

    public boolean getPosTagging() {
        return this.posTagging;
    }

    public int getMaxUnkLength() {
        return this.maxUnkLength;
    }

    public String getName() {
       return name;
    }
}
