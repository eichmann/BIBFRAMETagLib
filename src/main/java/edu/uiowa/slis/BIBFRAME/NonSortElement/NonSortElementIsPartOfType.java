package edu.uiowa.slis.BIBFRAME.NonSortElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonSortElementIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NonSortElementIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonSortElementIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonSortElementIsPartOfIterator theNonSortElementIsPartOfIterator = (NonSortElementIsPartOfIterator)findAncestorWithClass(this, NonSortElementIsPartOfIterator.class);
			pageContext.getOut().print(theNonSortElementIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonSortElement for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonSortElement for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

