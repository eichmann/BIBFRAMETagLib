package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceRecordedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceRecordedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceRecordedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceRecordedAtIterator theIntegratingResourceRecordedAtIterator = (IntegratingResourceRecordedAtIterator)findAncestorWithClass(this, IntegratingResourceRecordedAtIterator.class);
			pageContext.getOut().print(theIntegratingResourceRecordedAtIterator.getRecordedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

