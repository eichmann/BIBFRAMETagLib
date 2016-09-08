package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceProducedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceProducedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceProducedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceProducedAtIterator theIntegratingResourceProducedAtIterator = (IntegratingResourceProducedAtIterator)findAncestorWithClass(this, IntegratingResourceProducedAtIterator.class);
			pageContext.getOut().print(theIntegratingResourceProducedAtIterator.getProducedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

