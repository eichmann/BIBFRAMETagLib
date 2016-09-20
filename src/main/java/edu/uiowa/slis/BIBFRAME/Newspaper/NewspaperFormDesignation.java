package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperFormDesignationIterator theNewspaper = (NewspaperFormDesignationIterator)findAncestorWithClass(this, NewspaperFormDesignationIterator.class);
			pageContext.getOut().print(theNewspaper.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

