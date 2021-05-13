This is code for a knock-off of Call of Duty's create-a-class screen.
Though still in its early stages, it uses Swing (and somw awt) components,
objects extended from swing objects, along with implementations of ActionListener and MouseListener.

The only theoretical bug I know of is the retrieval of the images on a different computer. If you go into my ImageMaker class, it uses a
public ImageIcon to send images to other chuncks of code. However, ImageIcon (on windows, at least)
requires the entire directory name, starting with the drive letter. If you retype the directory, and
leave only the file name out of the string, calling the method with add on the file name via arguments.
If you do not change the directory, the code will work, but there wont be any images!
