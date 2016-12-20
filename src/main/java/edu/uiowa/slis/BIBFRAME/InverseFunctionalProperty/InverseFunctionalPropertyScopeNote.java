package edu.uiowa.slis.BIBFRAME.InverseFunctionalProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InverseFunctionalPropertyScopeNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InverseFunctionalPropertyScopeNote currentInstance = null;
	private static final Log log = LogFactory.getLog(InverseFunctionalPropertyScopeNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InverseFunctionalPropertyScopeNoteIterator theInverseFunctionalProperty = (InverseFunctionalPropertyScopeNoteIterator)findAncestorWithClass(this, InverseFunctionalPropertyScopeNoteIterator.class);
			pageContext.getOut().print(theInverseFunctionalProperty.getScopeNote());
		} catch (Exception e) {
			log.error("Can't find enclosing InverseFunctionalProperty for scopeNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing InverseFunctionalProperty for scopeNote tag ");
		}
		return SKIP_BODY;
	}
}

