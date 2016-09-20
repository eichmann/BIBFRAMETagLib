package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperRecordedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperRecordedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperRecordedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperRecordedAtIterator theNewspaperRecordedAtIterator = (NewspaperRecordedAtIterator)findAncestorWithClass(this, NewspaperRecordedAtIterator.class);
			pageContext.getOut().print(theNewspaperRecordedAtIterator.getRecordedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

