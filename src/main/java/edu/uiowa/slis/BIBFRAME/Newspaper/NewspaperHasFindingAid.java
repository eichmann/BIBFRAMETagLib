package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasFindingAid extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasFindingAid currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasFindingAid.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasFindingAidIterator theNewspaperHasFindingAidIterator = (NewspaperHasFindingAidIterator)findAncestorWithClass(this, NewspaperHasFindingAidIterator.class);
			pageContext.getOut().print(theNewspaperHasFindingAidIterator.getHasFindingAid());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

