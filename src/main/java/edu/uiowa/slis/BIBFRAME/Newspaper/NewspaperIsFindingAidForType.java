package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperIsFindingAidForType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperIsFindingAidForType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperIsFindingAidForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperIsFindingAidForIterator theNewspaperIsFindingAidForIterator = (NewspaperIsFindingAidForIterator)findAncestorWithClass(this, NewspaperIsFindingAidForIterator.class);
			pageContext.getOut().print(theNewspaperIsFindingAidForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

