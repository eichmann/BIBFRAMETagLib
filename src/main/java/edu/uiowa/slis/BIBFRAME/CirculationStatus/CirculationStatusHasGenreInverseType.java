package edu.uiowa.slis.BIBFRAME.CirculationStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CirculationStatusHasGenreInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CirculationStatusHasGenreInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CirculationStatusHasGenreInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CirculationStatusHasGenreInverseIterator theCirculationStatusHasGenreInverseIterator = (CirculationStatusHasGenreInverseIterator)findAncestorWithClass(this, CirculationStatusHasGenreInverseIterator.class);
			pageContext.getOut().print(theCirculationStatusHasGenreInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CirculationStatus for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing CirculationStatus for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

