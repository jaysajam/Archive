PK
    ݊jD            	  META-INF/��  PK
   ܊jDg��5Z   g      META-INF/MANIFEST.MF�M��LK-.�K-*��ϳR0�3��r�Cq,HL�HU �%-��x���RKRSt�*A����Lu�M4���sR��
�K��5y�x� PK
    i�jD               org/PK
    i�jD               org/netbeans/PK
    i�jD               org/netbeans/modules/PK
    i�jD               org/netbeans/modules/hudson/PK
    i�jD                org/netbeans/modules/hudson/api/PK
    i�jD            !   org/netbeans/modules/hudson/impl/PK
   i�jD4�J    0   org/netbeans/modules/hudson/Bundle_ja.properties�UMo7��W��X�,ے��Tl�e�n���K�j٬�Œ+E�����g���!qg�̼y3�@�)=M_����dF��&��_&4�>�=�ݿ����K��z��B��O�ɬs����l�.�<�t9ڽ�e����9�0���#��:�³�Ч<���d��U�s�?�R�(s�<��ȗB�B�����c0�qIF,��B�)�# |�eȠ`���ɮ��N�5c��x6�1֎ �1)W%É�(��ъu����R��\%����%��q�5�#k�5���[gdkב],�������b�$")c0Q�����:m����|*m�ו��� �Vc�:��W[E"��T!�]I�Cr�I��(@��L+�Ҡ4 5��l���u��8��y_|��X�V�>aa\ǖ��Tޞ�����"�%�6IR�\]�5��%��I��=w�� BZ��;���\�y%�Ls���h3�]�.��"{�^h/|�_��qu�WƆԖd`��Φ~���� �W�an��=CT%p���U`���� ��k���1�_�ot���	���Y��\��;�ek��
�V�� ��]j�
(�z�G�>?���E��Q�c@��
��F��H���CJ����Hrp'��)TjW���^��!�|+>�\9bph ��~g���;��ȅ��@Y۪SL��x��Cm �E���0϶�5�]\p[�(��-��P��.���[ͪ3�4ly��>n���`�_�Xxb�{�}4y0�kX4#�5�n|���R��ei��o�΁ ;�s�����+,�Y�pg=g`�e5y˦�jJ6�U� n��� �z��W�	3� �5�¸�/ �"ПВ�=b߉�s!����-;��P{�(ۑ���U�� �wjF���ԭl\��E�(�	5�̆a��I]谍3�b([�r�f�!���:˽w"�z����a� ���G秜"G����հ7�$t,���v�a�t]v��`ab�
i1���6�ڤ����6�q�GT��nxU�[k���S�®l��ZA���l�:''ӂ��x��lU�s!�~��ks[��V]u�0��g2���ף5����,u���}��5ߪ��)p�o���gzNُ��p�܋2�7��e�������ֿO�1�1�R���,|����J�������)$�8y��d�;H�%��nLs��M/�y�F���9��;�t{��Yׇt�Ƀ٬��n��*pt빎)\��y+~�?��	{�����K���?��ϻ�(����D�'� PK
   i�jDp�S=j   �   4   org/netbeans/modules/hudson/api/Bundle_ja.propertiesSV�6�U�U��r���KM.���s*��II-���O��̳*�)560K��F`2D&�E�,A�)��HB�4�IM�1 �2�i�`��`5f ������,Vi`�� PK
   i�jD(@Fy�   6  5   org/netbeans/modules/hudson/impl/Bundle_ja.properties]��j1E{}��u��^��µ�Tn��d�V���c����؁4��ܹw�/◿���o�%b��+�3�n����y��Cad�����8��+u��[fq/LgQG�,�.J�=t��\�|C��yH��9������߄�E�8����Xa�c�S=Ї� �v�'���@��mQE)h�2������fڭQ�ٌi��c�
PK
    ݊jD            	         �A    META-INF/��  PK
   ܊jDg��5Z   g              ��+   META-INF/MANIFEST.MFPK
    i�jD                      �A�   org/PK
    i�jD                      �A�   org/netbeans/PK
    i�jD                      �A  org/netbeans/modules/PK
    i�jD                      �A7  org/netbeans/modules/hudson/PK
    i�jD                       �Aq  org/netbeans/modules/hudson/api/PK
    i�jD            !          �A�  org/netbeans/modules/hudson/impl/PK
   i�jD4�J    0           ���  org/netbeans/modules/hudson/Bundle_ja.propertiesPK
   i�jDp�S=j   �   4           ��>  org/netbeans/modules/hudson/api/Bundle_ja.propertiesPK
   i�jD(@Fy�   6  5           ���  org/netbeans/modules/hudson/impl/Bundle_ja.propertiesPK      7  	                                                                                                                                                                                                                                                                                                                                                                                                                                        reset();
        reverseAlphabet(alphabet);
        reset();
        System.out.println("-> Reverse Alphabet <-");
        reverseAlphabet4(alphabet);
        reset();

        reset();
        System.out.println("=== Thank you for using the " + "Encrypto-matic" + "! ===");
    }
    
    /**
     * The intro and ending wrapper prompt for the between(char a, char b) method.
     */ 
    protected static void characterMethod()
    {
        System.out.println("-> Character Method <-");
        System.out.println("Choose which letter to start from...");
        letterStart = 'e';
        System.out.println(">Starting letter = "  + letterStart);
        System.out.println("Choose which letter to end from...");
        letterEnd   = 'l';
        System.out.println(">Ending letter   = "  + letterEnd);
        between(letterStart,letterEnd);
        System.out.println("There are " + count   + " letters in between of " 
                         + letterStart  + " and " + letterEnd);
        //Integer.toString(count)
        // count-3

    }
    
    /**
     * The intro and ending wrapper prompt for the betweenASCII(char a, char b) method.
     */ 
    protected static void ASCIIMethod()
    {
        System.out.println("-> ASCII Method <-");
        System.out.println("Choose which letter to start from...");
        letterStart = 'e';
        System.out.println(">Starting letter = " + letterStart);
        System.out.println("Choose which letter to end from...");
        letterEnd   = 'l';
        System.out.println(">Ending letter   = " + letterEnd);
        betweenASCII(letterStart,letterEnd);
        System.out.println("There are " + count   + " letters in between of " 
                         + letterStart  + " and " + letterEnd);
        //Integer.toString(count)
        //count-3
    }
    
    /**
     * Displays the characters that are between char a and char b.
     * (Uses count to keep track of how many recursions take place)
     * (A.K.A: The number of characters between char a and char b)
    */
    protected static void between(char a, char b)
    {
        count = count + 1; // count++;
        System.out.println(a);
        if (a < b) between((char) (a+1), b); // recursive case
        // base case
    }
    
    /**
     * Displays the characters that are between char a and char b
     * (based on their # position on the ASCII table)
   