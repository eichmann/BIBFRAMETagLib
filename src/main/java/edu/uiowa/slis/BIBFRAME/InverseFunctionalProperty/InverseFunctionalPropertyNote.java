package edu.uiowa.slis.BIBFRAME.InverseFunctionalProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InverseFunctionalPropertyNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InverseFunctionalPropertyNote currentInstance = null;
	private static final Log log = LogFactory.getLog(InverseFunctionalPropertyNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InverseFunctionalPropertyNoteIterator theInverseFunctionalProperty = (InverseFunctionalPropertyNoteIterator)findAncestorWithClass(this, InverseFunctionalPropertyNoteIterator.class);
			pageContext.getOut().print(theInverseFunctionalProperty.getNote());
		} catch (Exception e) {
			log.error("Can't find enclosing InverseFunctionalProperty for note tag ", e);
			throw new JspTagException("Error: Can't find enclosing InverseFunctionalProperty for note tag ");
		}
		return SKIP_BODY;
	}
}

