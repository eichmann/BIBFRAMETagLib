package edu.uiowa.slis.BIBFRAME.FunctionalProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FunctionalPropertyNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FunctionalPropertyNote currentInstance = null;
	private static final Log log = LogFactory.getLog(FunctionalPropertyNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FunctionalPropertyNoteIterator theFunctionalProperty = (FunctionalPropertyNoteIterator)findAncestorWithClass(this, FunctionalPropertyNoteIterator.class);
			pageContext.getOut().print(theFunctionalProperty.getNote());
		} catch (Exception e) {
			log.error("Can't find enclosing FunctionalProperty for note tag ", e);
			throw new JspTagException("Error: Can't find enclosing FunctionalProperty for note tag ");
		}
		return SKIP_BODY;
	}
}

