package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceSupersedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceSupersedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceSupersedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceSupersedesIterator theIntegratingResourceSupersedesIterator = (IntegratingResourceSupersedesIterator)findAncestorWithClass(this, IntegratingResourceSupersedesIterator.class);
			pageContext.getOut().print(theIntegratingResourceSupersedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

