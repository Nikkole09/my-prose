 /*
 * Copyright (C) 2025 Nicol
 *
 * This file is part of the my-prose project.
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 *
 * my-prose is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * my-prose is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package org.example;

public class TextAnalyzer {
    public static int countWords(String text) {
        return text.split("\\s+").length;
    }
}

