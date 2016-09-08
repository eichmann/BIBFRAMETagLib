package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperSupersedesIterator theNewspaperSupersedesIterator = (NewspaperSupersedesIterator)findAncestorWithClass(this, NewspaperSupersedesIterator.class);
			pageContext.getOut().print(theNewspaperSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

