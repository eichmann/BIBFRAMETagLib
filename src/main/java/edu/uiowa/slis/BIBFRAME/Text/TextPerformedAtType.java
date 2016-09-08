package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextPerformedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextPerformedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextPerformedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextPerformedAtIterator theTextPerformedAtIterator = (TextPerformedAtIterator)findAncestorWithClass(this, TextPerformedAtIterator.class);
			pageContext.getOut().print(theTextPerformedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

