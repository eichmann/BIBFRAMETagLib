package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographRecordedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographRecordedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographRecordedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographRecordedAtIterator theMonographRecordedAtIterator = (MonographRecordedAtIterator)findAncestorWithClass(this, MonographRecordedAtIterator.class);
			pageContext.getOut().print(theMonographRecordedAtIterator.getRecordedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

