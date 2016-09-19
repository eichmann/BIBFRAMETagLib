package edu.uiowa.slis.BIBFRAME.ContainerTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContainerTitleHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContainerTitleHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContainerTitleHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContainerTitleHasDerivativeIterator theContainerTitleHasDerivativeIterator = (ContainerTitleHasDerivativeIterator)findAncestorWithClass(this, ContainerTitleHasDerivativeIterator.class);
			pageContext.getOut().print(theContainerTitleHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContainerTitle for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContainerTitle for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

