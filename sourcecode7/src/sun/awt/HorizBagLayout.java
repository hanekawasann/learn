/*
 * Copyright (c) 1995, 2007, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package sun.awt;

import java.awt.*;

/**
 * A horizontal 'bag' of Components.  Allocates space for each Component
 * from left to right.
 *
 * @author Herb Jellinek
 */
public class HorizBagLayout implements LayoutManager {

    int hgap;

    /**
     * Constructs a new HorizBagLayout.
     */
    public HorizBagLayout() {
        this(0);
    }

    /**
     * Constructs a HorizBagLayout with the specified gaps.
     *
     * @param hgap the horizontal gap
     */
    public HorizBagLayout(int hgap) {
        this.hgap = hgap;
    }

    /**
     * Adds the specified named component to the layout.
     *
     * @param name the String name
     * @param comp the component to be added
     */
    public void addLayoutComponent(String name, Component comp) {
    }

    /**
     * Removes the specified component from the layout.
     *
     * @param comp the component to be removed
     */
    public void removeLayoutComponent(Component comp) {
    }

    /**
     * Returns the minimum dimensions needed to lay out the components
     * contained in the specified target container.
     *
     * @param target the Container on which to do the layout
     * @see Container
     * @see #preferredLayoutSize
     */
    public Dimension minimumLayoutSize(Container target) {
        Dimension dim = new Dimension();

        for (int i = 0; i < target.countComponents(); i++) {
            Component comp = target.getComponent(i);
            if (comp.isVisible()) {
                Dimension d = comp.minimumSize();
                dim.width += d.width + hgap;
                dim.height = Math.max(d.height, dim.height);
            }
        }

        Insets insets = target.insets();
        dim.width += insets.left + insets.right;
        dim.height += insets.top + insets.bottom;

        return dim;
    }

    /**
     * Returns the preferred dimensions for this layout given the components
     * in the specified target container.
     *
     * @param target the component which needs to be laid out
     * @see Container
     * @see #minimumLayoutSize
     */
    public Dimension preferredLayoutSize(Container target) {
        Dimension dim = new Dimension();

        for (int i = 0; i < target.countComponents(); i++) {
            Component comp = target.getComponent(i);
            if (comp.isVisible()) {
                Dimension d = comp.preferredSize();
                dim.width += d.width + hgap;
                dim.height = Math.max(dim.height, d.height);
            }
        }

        Insets insets = target.insets();
        dim.width += insets.left + insets.right;
        dim.height += insets.top + insets.bottom;

        return dim;
    }

    /**
     * Lays out the specified container. This method will actually reshape the
     * components in the specified target container in order to satisfy the
     * constraints of the HorizBagLayout object.
     *
     * @param target the component being laid out
     * @see Container
     */
    public void layoutContainer(Container target) {
        Insets insets = target.insets();
        int top = insets.top;
        int bottom = target.size().height - insets.bottom;
        int left = insets.left;
        int right = target.size().width - insets.right;

        for (int i = 0; i < target.countComponents(); i++) {
            Component comp = target.getComponent(i);
            if (comp.isVisible()) {
                int compWidth = comp.size().width;
                comp.resize(compWidth, bottom - top);
                Dimension d = comp.preferredSize();
                comp.reshape(left, top, d.width, bottom - top);
                left += d.width + hgap;
            }
        }
    }

    /**
     * Returns the String representation of this HorizBagLayout's values.
     */
    public String toString() {
        return getClass().getName() + "[hgap=" + hgap + "]";
    }
}
