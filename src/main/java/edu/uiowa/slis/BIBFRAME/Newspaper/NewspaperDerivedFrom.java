package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperDerivedFromIterator theNewspaperDerivedFromIterator = (NewspaperDerivedFromIterator)findAncestorWithClass(this, NewspaperDerivedFromIterator.class);
			pageContext.getOut().print(theNewspaperDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

