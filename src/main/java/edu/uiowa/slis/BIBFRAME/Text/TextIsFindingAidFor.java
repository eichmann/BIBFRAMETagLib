package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextIsFindingAidFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextIsFindingAidFor currentInstance = null;
	private static final Log log = LogFactory.getLog(TextIsFindingAidFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextIsFindingAidForIterator theTextIsFindingAidForIterator = (TextIsFindingAidForIterator)findAncestorWithClass(this, TextIsFindingAidForIterator.class);
			pageContext.getOut().print(theTextIsFindingAidForIterator.getIsFindingAidFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

