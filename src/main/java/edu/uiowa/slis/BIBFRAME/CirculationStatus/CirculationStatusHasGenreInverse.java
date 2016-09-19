package edu.uiowa.slis.BIBFRAME.CirculationStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CirculationStatusHasGenreInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CirculationStatusHasGenreInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CirculationStatusHasGenreInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CirculationStatusHasGenreInverseIterator theCirculationStatusHasGenreInverseIterator = (CirculationStatusHasGenreInverseIterator)findAncestorWithClass(this, CirculationStatusHasGenreInverseIterator.class);
			pageContext.getOut().print(theCirculationStatusHasGenreInverseIterator.getHasGenreInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing CirculationStatus for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing CirculationStatus for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

