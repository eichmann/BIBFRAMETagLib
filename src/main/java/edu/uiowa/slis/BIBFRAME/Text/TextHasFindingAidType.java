package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasFindingAidType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasFindingAidType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasFindingAidType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasFindingAidIterator theTextHasFindingAidIterator = (TextHasFindingAidIterator)findAncestorWithClass(this, TextHasFindingAidIterator.class);
			pageContext.getOut().print(theTextHasFindingAidIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

