package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextRecordedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextRecordedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(TextRecordedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextRecordedAtIterator theTextRecordedAtIterator = (TextRecordedAtIterator)findAncestorWithClass(this, TextRecordedAtIterator.class);
			pageContext.getOut().print(theTextRecordedAtIterator.getRecordedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

