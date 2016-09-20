package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperDerivedFromIterator theNewspaperDerivedFromIterator = (NewspaperDerivedFromIterator)findAncestorWithClass(this, NewspaperDerivedFromIterator.class);
			pageContext.getOut().print(theNewspaperDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

