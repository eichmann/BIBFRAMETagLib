package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationRecordedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationRecordedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationRecordedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationRecordedAtIterator theDissertationRecordedAtIterator = (DissertationRecordedAtIterator)findAncestorWithClass(this, DissertationRecordedAtIterator.class);
			pageContext.getOut().print(theDissertationRecordedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

