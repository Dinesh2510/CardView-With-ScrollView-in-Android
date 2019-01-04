# CardView-With-ScrollView-in-Andriod

![giphy](https://user-images.githubusercontent.com/46309253/50691922-3ee6f280-1058-11e9-8660-2f746ade6d78.gif)

## Card View, Grid View and ImageView

<GridLayout

            android:layout_width="match_parent"

            android:layout_height="wrap_content"

            android:alignmentMode="alignMargins"

            android:columnCount="2"

            android:columnOrderPreserved="false"

            android:rowCount="3">


            <android.support.v7.widget.CardView

                android:id="@+id/card1"

                android:layout_width="wrap_content"

                android:layout_height="wrap_content"

                android:layout_rowWeight="1"

                android:layout_columnWeight="1"

                android:layout_margin="12dp"

                app:cardCornerRadius="12dp"

                app:cardElevation="6dp">

                <LinearLayout

                    android:layout_width="match_parent"

                    android:layout_height="match_parent"

                    android:gravity="center"

                    android:orientation="vertical"

                    android:padding="16dp">

                    <ImageView

                        android:layout_width="80dp"

                        android:layout_height="80dp"

                        android:src="@drawable/angular" />

                    <TextView

                        android:layout_width="wrap_content"

                        android:layout_height="wrap_content"

                        android:layout_marginTop="12dp"

                        android:text="Angular"

                        android:textColor="#6f6f6f"

                        android:textSize="18dp" />

                </LinearLayout>
                


## Library
-  implementation 'com.android.support:cardview-v7:28.0.0'

                
