package edu.uiowa.slis.BIBFRAME.Motivation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MotivationHasGenreInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MotivationHasGenreInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MotivationHasGenreInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MotivationHasGenreInverseIterator theMotivationHasGenreInverseIterator = (MotivationHasGenreInverseIterator)findAncestorWithClass(this, MotivationHasGenreInverseIterator.class);
			pageContext.getOut().print(theMotivationHasGenreInverseIterator.getHasGenreInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Motivation for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing Motivation for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

