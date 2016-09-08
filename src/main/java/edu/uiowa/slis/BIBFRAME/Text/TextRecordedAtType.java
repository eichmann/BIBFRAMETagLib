package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextRecordedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextRecordedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextRecordedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextRecordedAtIterator theTextRecordedAtIterator = (TextRecordedAtIterator)findAncestorWithClass(this, TextRecordedAtIterator.class);
			pageContext.getOut().print(theTextRecordedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

