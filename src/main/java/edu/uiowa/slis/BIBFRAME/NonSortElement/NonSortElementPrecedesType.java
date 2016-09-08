package edu.uiowa.slis.BIBFRAME.NonSortElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonSortElementPrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NonSortElementPrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonSortElementPrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonSortElementPrecedesIterator theNonSortElementPrecedesIterator = (NonSortElementPrecedesIterator)findAncestorWithClass(this, NonSortElementPrecedesIterator.class);
			pageContext.getOut().print(theNonSortElementPrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonSortElement for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonSortElement for precedes tag ");
		}
		return SKIP_BODY;
	}
}

