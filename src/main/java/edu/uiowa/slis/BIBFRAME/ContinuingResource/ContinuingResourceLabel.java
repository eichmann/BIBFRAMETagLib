package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ContinuingResource theContinuingResource = (ContinuingResource)findAncestorWithClass(this, ContinuingResource.class);
			if (!theContinuingResource.commitNeeded) {
				pageContext.getOut().print(theContinuingResource.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ContinuingResource theContinuingResource = (ContinuingResource)findAncestorWithClass(this, ContinuingResource.class);
			return theContinuingResource.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ContinuingResource for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ContinuingResource theContinuingResource = (ContinuingResource)findAncestorWithClass(this, ContinuingResource.class);
			theContinuingResource.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for label tag ");
		}
	}
}

